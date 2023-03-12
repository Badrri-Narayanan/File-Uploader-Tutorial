const express = require("express");
const upload = require("express-fileupload");
const { EmployeeParser } = require("./employee_parser");

const app = express();

app.use(upload());

app.get("/", (req, res) => {
    res.sendFile(__dirname + "/front-end/index.html");
})

app.post("/", (req, res) => {
    if(req.files) {
        const uploadedFile = req.files.file
        const content = uploadedFile.data.toString()

        const employee_parser = new EmployeeParser(content);
        employee_parser.parseContent();
        
        res.status(200).send({action: "success", records: employee_parser.getEmployees()});
    } else {
        res.status(400).send({action: "unable to parse the uploaded file"});
    }
})

app.listen(4000, () => {
    console.log("the server is now online.")
})