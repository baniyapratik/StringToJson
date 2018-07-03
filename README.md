# StringToJson
/*
 * This Project is responsible for Reading a file of applicants
 * There could be multiple applicants thus using the delimiter of !
 * Finally users can either get the Json Object or Json String
 * We also provide a method to print the Json String
 * 
 * Written By: Pratik Baniya
 * */
 
 
 The idea here to have a Applicant class is that after we read the file, it would be 
 convinient for any user to ingest the data and make modifications accordingly before 
 converting it to Json Object.
 
 Some Edge cases such as file not existing, file length and can read has also been looked into.
 One additional, thing i can think of is have a decoder to convert from Json to File to compliment the application.
 
 Two Classes
 - Applicant
 - StringToJson
 - StringToJsonTest
 
 Support Library used here is Gson.
 
 Below is a sample output from the application:
 
 The file is valid and ready to be parsed!
[
  {
    "Name": "Pratik Baniya",
    "Address": "123 Test Lane",
    "City": "Oklahoma City",
    "Zip": "73160",
    "Certifications": [
      "UAS Pilot I",
      "UAS Pilot II",
      "UAS Support Crew V"
    ]
  }
]

This is my output 2 from multiple applicants file

The file is valid and ready to be parsed!
[
  {
    "Name": "Pratik Baniya",
    "Address": "123 Test Lane",
    "City": "Oklahoma City",
    "Zip": "73160",
    "Certifications": [
      "UAS Pilot I",
      "UAS Pilot II",
      "UAS Support Crew V",
      "UAS Pilot I"
    ]
  },
  {
    "Name": "New Emp",
    "Address": "123 Test Lane",
    "City": "california",
    "Zip": "94041",
    "Certifications": [
      "UAS Pilot I",
      "UAS Pilot II",
      "UAS Support Crew V",
      "UAS Pilot I"
    ]
  }
]
