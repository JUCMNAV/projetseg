//As is from: http://www.java2s.com/Tutorial/Java/0180__File/Removeadirectoryandallofitscontents.htm
package aoUrnToRam.javaExternalCall;
import java.io.File;

//commit demo

/*

 Derby - Class org.apache.derby.iapi.util.PropertyUtil

 Licensed to the Apache Software Foundation (ASF) under one or more
 contributor license agreements.  See the NOTICE file distributed with
 this work for additional information regarding copyright ownership.
 The ASF licenses this file to you under the Apache License, Version 2.0
 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

 */

public class DirectoryRemover {

  /**
  Remove a directory and all of its contents.

  The results of executing File.delete() on a File object
  that represents a directory seems to be platform
  dependent. This method removes the directory
  and all of its contents.

  @return true if the complete directory was removed, false if it could not be.
  If false is returned then some of the files in the directory may have been removed.

*/
public static boolean removeDirectory(File directory) {

  // System.out.println("removeDirectory " + directory);

  if (directory == null)
    return false;
  if (!directory.exists())
    return true;
  if (!directory.isDirectory())
    return false;

  String[] list = directory.list();

  // Some JVMs return null for File.list() when the
  // directory is empty.
  if (list != null) {
    for (int i = 0; i < list.length; i++) {
      File entry = new File(directory, list[i]);

      //        System.out.println("\tremoving entry " + entry);

      if (entry.isDirectory())
      {
        if (!removeDirectory(entry))
          return false;
      }
      else
      {
        if (!entry.delete())
          return false;
      }
    }
  }

  return directory.delete();
}



}