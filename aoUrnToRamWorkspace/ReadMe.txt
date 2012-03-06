In order to setup the AoURNtoRAM development environment, you should:

*** Setup Eclipse ***
- Install the Eclipse+Kermeta Bundle
  https://gforge.inria.fr/frs/download.php/27135/kermeta-1.4.1-all-platform.redirect.html
- the kermeta eclipse needs to be started with the "-vmargs -Xmx2048M"
  switches (or higher) for performance reasons
- Intall Web Tools Platform (WTP) from the Eclipse update site: http://download.eclipse.org/webtools/updates/ 
  Only "Web Tools Platform (WTP) $LatestVersion" need to be installed	
- Uninstall Maven from Help/Install New Software. 
  Click on "What is already installed", select Maven and uninstall.

*** Check Out the Source Files ***
- Checkout svn://cserg0.site.uottawa.ca/projetseg/trunk
- Import aoUrnToRam, codeGen, ReactiveWorkflow, seg.jUCMNav, seg.jUCMNav.aoUrnToRamPlugin
  (file - import - General - Existing Project into Workspace)
- Import the launch configurations 
  (Import - Run/Debug - Launch Configurations and then select the aoUrnToRamWorkspace/toImport folder)
- Open the Kermeta perspective in order to get the Kermeta menu
  (Window/Open Perspective/Others)
- Use the run configuration (play sign down arrow - Run configuration) to launch
  ->jUcmNav with the aoUrnToRamPlugin 
    Eclipse Application/jUcmNav
    (Right click on the UCM - Export - Export whole URN file - File type: Ram Reactive Workflows)
  ->Integration tests
    Kermeta Constraint Application - Integration
  ->Launch all unit tests
    Kermeta Constraint Application - TDD All
  ->Generate the code of _Ref.kmt 
    Java Application - Update Ref
    (_Ref.kmt must be opened in the editor)
  ->Generate the code of TestRunner.CodeGen.kmt
    Java Application - Gen TestRunner  
    (TestRunner.CodeGen.kmt must be opened in the editor)

***Extra ***
- Kermeta Manual
  http://www.kermeta.org/docs/fr.irisa.triskell.kermeta.documentation/build/pdf.fop/KerMeta-Manual/KerMeta-Manual.pdf
- A diff viewer (For integration tests)
  I am using BeyoundCompare which is not free. However, any diff viewer will work.
- GraphViz (For debugging .dot files)
  http://www.graphviz.org/Download.php
- RAM tool: needs to be installed in its own eclipse at the moment 
  (may be combined with AoURNtoRAM in the future)

