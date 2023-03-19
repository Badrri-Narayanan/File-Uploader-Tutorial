package main

import (
	"com.fileupload/fileupload"
	"com.fileupload/middleware"
	"github.com/gin-gonic/gin"
)

func main() {
	r := gin.Default()
	r.Use(middleware.HandleCrossOriginRequest())

	serverTest := func(c *gin.Context) {
		c.JSON(200, gin.H{
			"message": "the server is online",
		})
	}

	r.GET("/ping", serverTest)
	r.POST("/fileupload", fileupload.HandleFileUpload)
	r.Run(":8000")
}
