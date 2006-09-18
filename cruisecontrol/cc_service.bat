@echo off
cd c:\work\cruisecontrol\

:START_LOOP

REM this script maps the network drive required for CruiseControl
map_ccbuilds.vbs

REM wait 2 seconds just in case the mapping takes a bit longer
sleep 2

rem cruisecontrol.bat >> logs/tmp.log
cruisecontrol.bat 

REM trying to prevent it from stopping
REM GOTO START_LOOP