package fileupload

import (
	"com.fileupload/model"
	"github.com/gin-gonic/gin"
	"github.com/gocarina/gocsv"
)

func HandleFileUpload(c *gin.Context) {
	uploadedFile, err := c.FormFile("file")
	sendErrorResponse(err, c)

	file, err := uploadedFile.Open()
	sendErrorResponse(err, c)

	var employees []model.Employee

	error := gocsv.UnmarshalMultipartFile(&file, &employees)
	sendErrorResponse(error, c)

	c.JSON(200, gin.H{
		"action":  "success",
		"records": employees,
	})
}

func sendErrorResponse(err error, c *gin.Context) {
	if err != nil {
		c.JSON(400, gin.H{
			"action":  "failed to parse file. " + err.Error(),
			"records": "",
		})
	}
}
