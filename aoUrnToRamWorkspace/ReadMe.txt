In order to setup the AoURNtoRAM development environment, you should:

*** Setup Eclipse ***
- Download Eclipse 3.7 Modeling Tools (Indigo): 
  http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/indigosr2 
  Note: Use the 64-bit version if your CPU/OS support it.

- Install "Kermeta IDE/Kermeta compiler" from the Eclipse update site: 
  http://www.kermeta.org/update

- For performance reasons, Kermeta requires more memory than standard eclipse applications.
  In order to increase the heap size, set -Xmx3000M in $EclipseDir$\eclipse.ini.
  On 32bits CPU/OS, the maximum value is -Xmx1200M
  For details, see: http://stackoverflow.com/questions/3769874/eclipse-memory-allocation-problem
  Note: if your cannot save $EclipseDir$\eclipse.ini because it is located under "Program Files", 
        just copy $EclipseDir$\eclipse.ini to your desktop, update it, and overwrite $EclipseDir$\eclipse.ini with the updated version.

(Required to compile jUcmNav)
- Install "Web Tools Platform (WTP) 3.3.2" from the Eclipse update site: 
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
  ->Generate the code of _Ref.kmt 
    Java Application - Update Ref
    _Ref.kmt must be opened in the editor
  ->Generate the code of TestRunner.CodeGen.kmt
    Java Application - Gen TestRunner  
    TestRunner.CodeGen.kmt must be opened in the editor

***Extra ***
- Kermeta Manual
  http://www.kermeta.org/docs/fr.irisa.triskell.kermeta.documentation/build/pdf.fop/KerMeta-Manual/KerMeta-Manual.pdf
- A diff viewer (For integration tests)
  I am using BeyoundCompare which is not free. However, any diff viewer will work.
- GraphViz (For debugging .dot files)
  http://www.graphviz.org/Download.php
- RAM tool: needs to be installed in its own eclipse at the moment 
  (may be combined with AoURNtoRAM in the future)
  