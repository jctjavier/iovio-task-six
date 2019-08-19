ECHO OFF
CLS 

ECHO 'Bol.Com mobile app automation test starts now. Task 6 for IOVIO TC'
ECHO 'by: jctjavier'
ECHO.
ECHO '**************************************************************************'
ECHO '** Please ensure your mobile is connected and the BOL app is installed. **'
ECHO '**************************************************************************'
ECHO.
git clone https://github.com/jctjavier/iovio-task-six.git
cd iovio-task-six
git fetch 
git pull

start cmd /k appium

mvn clean install test
