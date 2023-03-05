class Employee {
    constructor(row) {
        this.row = row;
    }

    getRecord = () => {
        const parsedContent = this.row.split(",");
        return {
            id: parsedContent[0],
            first_name: parsedContent[1],
            last_name: parsedContent[2],
            email: parsedContent[3],
            gender: parsedContent[4],
            company: parsedContent[5],
            job_title: parsedContent[6],
        }
    }
}

module.exports = {
    Employee
};