In order to setup the AoURNtoRAM development environment, you should:
- Install the Eclipse+Kermeta Bundle
https://gforge.inria.fr/frs/download.php/27135/kermeta-1.4.1-all-platform.redirect.html
- the kermeta eclipse needs to be started with the "-vmargs -Xmx2048M"
switches (or higher) for performance reasons
- Uninstall Maven from Help/Install New Software. 
  Click on "What is already installed", select Maven and uninstall.
  Note: I am not 100% sure if Kermeta depends on Maven or not. 
  However, I did not encounter any problems after uninstalling Maven and it removed
  the delay at Ecplise startup caused by Maven not being properly configured. 
  Moreover, the .metadata folder will shrunk from 200Mo to 12Mo. 
- Checkout svn://cserg0.site.uottawa.ca/projetseg/trunk/aoUrnToRamWorkspace
- import the three projects (aoUrnToRam, codeGen, and javaExternCall) into
the kermeta eclipse
- import the launch configurations (Import - Run/Debug - Launch
Configurations and then select the toImport folder)
- Open the Kermeta perspective from Window/Open Perspective/Others
- at this point, there is one hardcoded path that needs to be set after
checking out the repository: in
aoUrnToRam/test/integration/IntegrationTestCase.kmt projectFolderUri in
method setUp() must point to the workspace

Moreover, these resources/tools would be very handy:
- Kermeta Manual
http://www.kermeta.org/docs/fr.irisa.triskell.kermeta.documentation/build/pdf.fop/KerMeta-Manual/KerMeta-Manual.pdf
- A diff viewer (For integration tests)
I am using BeyoundCompare which is not free. However, any diff viewer will
work.
- GraphViz (For debugging .dot files)
http://www.graphviz.org/Download.php

RAM tool: needs to be installed in its own eclipse at the moment (may be
combined with AoURNtoRAM in the future)

jUCMNav tool: needs to be installed in its own eclipse at the moment (may
be combined with AoURNtoRAM in the future)
