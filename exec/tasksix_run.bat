cls 

echo 'Bol.Com mobile app automation test starts now. Task 6 for IOVIO TC'
echo 'by: jctjavier'
echo ''
echo '**************************************************************************'
echo '** Please ensure your mobile is connected and the BOL app is installed. **'
echo '**************************************************************************'

git clone https://github.com/jctjavier/iovio-task-six.git
cd iovio-task-two
git fetch 
git pull

start cmd /k appium

mvn clean install test
