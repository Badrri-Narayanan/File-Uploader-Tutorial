package model

type Employee struct {
	Id        int    `json:"id" csv:"id"`
	FirstName string `json:"first_name"  csv:"first_name"`
	LastName  string `json:"last_name"  csv:"last_name"`
	Email     string `json:"email"  csv:"email"`
	Gender    string `json:"gender"  csv:"gender"`
	Company   string `json:"company"  csv:"company"`
	JobTitle  string `json:"job_title"  csv:"job_title"`
}
