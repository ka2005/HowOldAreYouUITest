 # Howoldareu Automation Test
 This project contains automation tests for https://howoldru.m-messiah.cc/ 

 ### Tools Used
- Java
- Selenium
- Webdrivermanager
- Junit
- Cucumber
- Maven

### Reports:
- howOldAreuResults_report.png ---- All Tests passed Report (html Report)
- test_run.png---- Console Report

### Known Issues
1. name field should accept only letters , but accepting numbers & symbols as well. so there is a BUG under name field.
2. Name field accepting unlimited size , should be limit size.
3. Year(yyyy) should accept 4 digits only , but accepting 6 digits
4. Year(yyyy)  should be in format date , but accepting 7899 like this

### Improvements need on this Framework
1. Run project on different browsers Ex: IE ,Firefox ,Mobile Devices
2. Send notifications to Slack or Teams channel in case build fails.   
3. We can add loggers for clarity understanding
3. We can add properties file.
4. We can combine all feature files in a single feature file as well , but  I just written seperately  
5. We can select date from calendar  

