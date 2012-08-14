' MNDArguments.vbs
' VBScript to map a network drive with all 5 arguments.
' Author Guy Thomas http://computerperformance.co.uk/
' Version 1.3 - April 24th 2005
' ----------------------------------------------------------------------'
Option Explicit
On Error Resume Next
Dim objNetwork
Dim strDriveLetter, strRemotePath, strUser, strPassword, strProfile

' Values of variables set
strDriveLetter = "R:"
strRemotePath = "\\cserg0\ccbuilds"
strUser = "ccbuilds"
strPassword = "cruisecontrol"
strProfile = "false"

' This section creates a network object. (objNetwork)
' Then apply MapNetworkDrive method. Result R: drive
' Note, this script features 5 arguments on lines 21/22.
Set objNetwork = WScript.CreateObject("WScript.Network")
objNetwork.MapNetworkDrive strDriveLetter, strRemotePath, _
strProfile, strUser, strPassword

' Extra code just to add a message box
'WScript.Echo " Launch Explorer, check: "& strDriveLetter
WScript.Quit

' End of Example script .