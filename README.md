# iovio-task-six
##### status : *incomplete*

## Use Case
* Automate on the mobile phone a Native/Hybrid/Mobile Web app

## Pre-requisites
1. Java JDK installed and added to environment variables
2. Maven installed and added to environment variables
3. Git installed
4. Appium Desktop/Appium Server installed and added to environment variables
5. Android SDK Tools Installed and added to environment variables
6. Android Device
7. Bol App installed in the Android Device
8. Windows 7/8/10
9. _(Optional)_ Node.JS and NPM

## HOW TO : Get Device Name using ADB
1. Ensure that you have ADB Tools installed 
2. In command shell, enter the following command:
```
adb devices
```
3. Take note of the device name

## Project Set-up
1. Clone the project into your computer using the following command:
```
git clone https://github.com/jctjavier/iovio-task-six.git
```

2. Navigate into the project folder
```
cd iovio-task-six
```

3. Open *config.properties* in *\lib* folder and edit/update the following properties:
* device.name = name of device
* android.platform = os version of device
Example:
```
device.name=emulator-1234

android.platform=8.0
```
4. Save changes to *config.properties*

### Run Tests
1. Open CMD or terminal
2. Change directory to project directory.
Example:
```
cd iovio-task-six
```

3. Run tests using the following command:
```
mvn clean install test
```

4. _(Optional)_ Subsequent tests can be run using the following command:
```
mvn test
```

### Test Reports
1. Navigate to project folder
2. Navigate to **\ExtentReports** folder
3. File name is **ExtentReportResults.html**

### Add tests to Jenkins / Windows Scheduler / CRON jobs 
#### Pre-requisites
1. Node.JS and NPM installed
2. Appium Server installed
3. Device connected with BOL app installed OR Emulator with BOL app installed

#### Windows Scheduler
1. Download the batch file **(tasksix_run.bat)** and save in a preferred directory
1. Open Control Panel and navigate to **Task Scheduler**
2. Click **Create Task** in the Actions panel to create a new scheduled task.
3. Use the wizard to set task properties
4. In the **Security Options** group, select **Run only when user is logged on*
5. In the Program/script box, enter the path to the batch file:
_Example:_
```
"C:\Scripts\tasksix_run.bat"
```
6. Click OK to save changes

#### CRON Jobs
1. Download the shellscript **(tasksix_run.sh)** and save in a preferred directory
* Note: The shellscript to clone and run the test can be downloaded from the exec folder in this repository
3. To schedule the job to run at 1:00pm, add the following to the file:
```
59 12 * * * ~/<PATH to sh file>/tasksix_run.sh
```