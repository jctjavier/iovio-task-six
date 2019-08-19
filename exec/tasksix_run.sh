#!/bin/bash
clear

echo 'Bol.Com mobile app automation test starts now. Task 6 for IOVIO TC'
echo 'by: jctjavier'
echo ''
echo '**************************************************************************'
echo '** Please ensure your mobile is connected and the BOL app is installed. **'
echo '**************************************************************************'

git clone https://github.com/jctjavier/iovio-task-two.git
cd iovio-task-six
git fetch 
git pull

appium&

mvn clean install test
