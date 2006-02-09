@echo off
cd c:\work\cruisecontrol\

REM this script maps the network drive required for CruiseControl
map_ccbuilds.vbs

REM wait 2 seconds just in case the mapping takes a bit longer
sleep 2

cruisecontrol.bat >> logs/tmp.log

