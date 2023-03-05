const { Employee } = require("./employee");

class EmployeeParser {
    constructor(csvContent) {
        this.csvContent = csvContent;
        this.employeeRecords = []
    }

    parseContent = () => {
        const rows = this.csvContent.split("\n");

        // removes header
        rows.shift();
        for(let row of rows) {
            let employee = new Employee(row)
            this.employeeRecords.push(employee.getRecord());
        }
    }

    getEmployees = () => {
        return this.employeeRecords;
    }
}

module.exports = {
    EmployeeParser
};