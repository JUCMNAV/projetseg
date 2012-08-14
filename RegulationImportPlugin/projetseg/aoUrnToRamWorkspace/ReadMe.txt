In order to setup the AoURNtoRAM development environment, you should:

*** Setup Eclipse ***
- Download the Eclipse Modeling Tools 
  Note: Use the 64-bit version if your CPU/OS support it.
  Latest tested version:
    3.7 Indigo
    http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/indigosr2 

- Install "Kermeta IDE/Kermeta compiler" from the Eclipse update site
  Latest tested version: 
    1.4.0
    http://www.kermeta.org/update

- For performance reasons, Kermeta requires more memory than standard eclipse applications.
  In order to increase the heap size, set -Xmx3000M in $EclipseDir$\eclipse.ini.
  On 32bits CPU/OS, the maximum value is -Xmx1200M
  For details, see: http://stackoverflow.com/questions/3769874/eclipse-memory-allocation-problem
  Note: if your cannot save $EclipseDir$\eclipse.ini because it is located under "Program Files", 
        just copy $EclipseDir$\eclipse.ini to your desktop, update it, and overwrite $EclipseDir$\eclipse.ini with the updated version.


- Install "Web Tools Platform (WTP)" from the Eclipse update site 
  (Required to compile jUcmNav) 
  Latest tested version: 
    3.3.2
    http://download.eclipse.org/webtools/repository/indigo/

*** Check Out the Source Files ***
- Checkout svn://cserg0.site.uottawa.ca/projetseg/trunk
- Import aoUrnToRam, codeGen, ReactiveWorkflow, seg.jUCMNav, seg.jUCMNav.aoUrnToRamPlugin
  file - import - General - Existing Project into Workspace
- Import the launch configurations 
  Import - Run/Debug - Launch Configurations and then select the aoUrnToRamWorkspace/toImport folder
- Open the Kermeta perspective in order to get the Kermeta menu
  Window/Open Perspective/Others
- Use the run configuration (play sign down arrow - Run configuration) to launch
  ->jUcmNav with the aoUrnToRamPlugin 
    Eclipse Application/jUcmNav
    Right click on the UCM - Export - Export whole URN file - File type: Ram Reactive Workflows

  (Does not require to compile jUcmNav)  
  ->Integration tests
    Kermeta Constraint Application - Integration
  ->Launch all unit tests
    Kermeta Constraint Application - TDD All
    *Note: After running large test suite (All unit test, Integration tests),
           clicking on "Remove Kermeta Units from Memory" will significantly 
           reduce the execution time of the other tests.
  ->Generate the code of _Ref.kmt 
    Java Application - Update Ref
    _Ref.kmt must be opened in the editor
  ->Generate the code of TestRunner.CodeGen.kmt
    Java Application - Gen TestRunner  
    TestRunner.CodeGen.kmt must be opened in the editor

*** Extra ***
- Kermeta Manual
  http://www.kermeta.org/docs/fr.irisa.triskell.kermeta.documentation/build/pdf.fop/KerMeta-Manual/KerMeta-Manual.pdf
- A diff viewer (For integration tests)
  I am using BeyoundCompare which is not free. However, any diff viewer will work.
- GraphViz (For debugging .dot files)
  http://www.graphviz.org/Download.php
- RAM tool: needs to be installed in its own eclipse at the moment 
  (may be combined with AoURNtoRAM in the future)
  
*** Release Procedure ***
- Rebuild all projects
  Project - Clean - Clean all projects
- Export aoUrnToRamPlugin
  Right click on seg.jUCMNav.aoUrnToRamPlugin - Export - Plug-ins and fragments - Finish
- Zip the exported plugin (seg.jUCMNav.aoUrnToRamPlugin_1.0.0.jar) and the aoUrnToRam
  folder (aoUrnToRamWorkspace/aoUrnToRam) to aoUrnToRam_release_$version.zip. 
  Note: Make that sure that both seg.jUCMNav.aoUrnToRamPlugin_1.0.0.jar and the aoUrnToRam
  folder are at the root level of the zip. That is, when you extract the zip to the eclipse/dropins folder extracted files should be:
    eclipse/dropins/seg.jUCMNav.aoUrnToRamPlugin_1.0.0.jar
    eclipse/dropins/aoUrnToRam/
- Add the Zip to the Website

*** Install a Release Version of AoUrnToRam ***
- Download the Eclipse Modeling Tools 
  Note: Use the 64-bit version if your CPU/OS support it.
  Latest tested version:
    3.7 Indigo
    http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/indigosr2 

- Install "jUCMNav: URN Editor (UCM and GRL)" from the Eclipse update site
  Latest tested version: 
    5.0.0
    http://jucmnav.softwareengineering.ca/jucmnav/updatesite/ 

- Install "Kermeta IDE/Kermeta compiler" from the Eclipse update site
  Latest tested version: 
    1.4.0
    http://www.kermeta.org/update

- For performance reasons, Kermeta requires more memory than standard eclipse applications.
  In order to increase the heap size, set -Xmx3000M in $EclipseDir$\eclipse.ini.
  On 32bits CPU/OS, the maximum value is -Xmx1200M
  
  Note: if your cannot save $EclipseDir$\eclipse.ini because it is located under "Program Files", just copy $EclipseDir$\eclipse.ini to your desktop, update it, and overwrite $EclipseDir$\eclipse.ini with the updated version.

- Install AoUrnToRam
  - Close Eclipse
  - Unzip aoUrnToRamRelease_1.0.0.zip to eclipse/dropins
    The eclipse/dropins folder should look as follow:
      eclipse/dropins/seg.jUCMNav.aoUrnToRamPlugin_1.0.0.jar
      eclipse/dropins/aoUrnToRam/
  - Start Eclipse
  - You are ready to export from AoUrn to RAM!
    Create a new Use Case Map - Right click export on the Use Case Map diagram - Export whole URN file - Ram Reactive Workflows - Finish
    Note: The first export from AoUrn to RAM takes an extra 30 secs. Please be patient.