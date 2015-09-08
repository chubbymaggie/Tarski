/*******************************************************************************
 * Copyright (c) 2015 UNIT Information Technologies R&D Ltd All rights reserved. This program and
 * the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Ferhat Erata - initial API and implementation H. Emre Kirmizi - initial API and
 * implementation Serhat Celik - initial API and implementation U. Anil Ozturk - initial API and
 * implementation
 *******************************************************************************/
package eu.modelwriter.marker.internal;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import eu.modelwriter.marker.Serialization;

public final class MarkElementUtilities {
  private static transient String TARGET_ATTRIBUTE_NAME = "TARGET_MARKED_ELEMENT";
  private static transient String SOURCE_ATTRIBUTE_NAME = "SOURCE_MARKED_ELEMENT";

  public static final String GROUP_ID = "GROUP_ID";
  public static final String LEADER_ID = "LEADER_ID";
  public static final String MARKER_TYPE = "MARKER_TYPE";

  /**
   * 
   * @param sourceId
   * @param path
   * @return IMarker
   */
  public static IMarker getiMarker(String sourceId, String path) {
    IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
    return MarkerFactory.findMarkerBySourceId(file, sourceId);
  }

  public static String getPath(IMarker iMarker) {
    return iMarker.getResource().getFullPath().toString();
  }

  public static void setUri(IMarker iMarker, String uri) {
    try {
      iMarker.setAttribute("uri", uri);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static String getUri(IMarker iMarker) {
    try {
      if (iMarker.getAttribute("uri") != null)
        return iMarker.getAttribute("uri").toString();
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static String setXpath(IMarker iMarker, String xPath) {
    try {
      iMarker.setAttribute("xpath", xPath);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static String getXpath(IMarker iMarker) {
    try {
      return ((String) iMarker.getAttribute("xpath"));
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static String getSourceId(IMarker iMarker) {
    try {
      return (String) iMarker.getAttribute(IMarker.SOURCE_ID);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void setGroupId(IMarker iMarker, String groupId) {
    try {
      iMarker.setAttribute(GROUP_ID, groupId);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static String getGroupId(IMarker iMarker) {
    try {
      return (String) iMarker.getAttribute(GROUP_ID);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void setLeaderId(IMarker iMarker, String leaderId) {
    try {
      iMarker.setAttribute(LEADER_ID, leaderId);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static String getLeaderId(IMarker iMarker) {
    try {
      return (String) iMarker.getAttribute(LEADER_ID);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static String getType(IMarker iMarker) {
    try {
      return (String) iMarker.getAttribute(MARKER_TYPE);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void setType(IMarker iMarker, String type) {
    try {
      iMarker.setAttribute(MARKER_TYPE, type);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static int getStart(IMarker iMarker) {
    try {
      return (int) iMarker.getAttribute(IMarker.CHAR_START);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public static void setStart(IMarker iMarker, int start) {
    try {
      iMarker.setAttribute(IMarker.CHAR_START, start);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static int getEnd(IMarker iMarker) {
    try {
      return (int) iMarker.getAttribute(IMarker.CHAR_END);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public static void setEnd(IMarker iMarker, int end) {
    try {
      iMarker.setAttribute(IMarker.CHAR_END, end);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static int getLength(IMarker iMarker) {
    try {
      return (int) iMarker.getAttribute(IMarker.CHAR_END) - MarkElementUtilities.getStart(iMarker);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public static String getMessage(IMarker iMarker) {
    try {
      return (String) iMarker.getAttribute(IMarker.MESSAGE);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void setMessage(IMarker iMarker, String message) {
    try {
      iMarker.setAttribute(IMarker.MESSAGE, message);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static String getText(IMarker iMarker) {
    try {
      return (String) iMarker.getAttribute(IMarker.TEXT);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void setText(IMarker iMarker, String text) {
    try {
      iMarker.setAttribute(IMarker.TEXT, text);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static int getLinenumber(IMarker iMarker) {
    try {
      return (int) iMarker.getAttribute(IMarker.LOCATION);
    } catch (CoreException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public static void setLinenumber(IMarker iMarker, int linenumber) {
    try {
      iMarker.setAttribute(IMarker.LOCATION, linenumber);
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }

  public static String getTargetAttributeName() {
    return TARGET_ATTRIBUTE_NAME;
  }

  public static String getSourceAttributeName() {
    return SOURCE_ATTRIBUTE_NAME;
  }

  /**
   * @param iMarker
   * @return If marker has not any source returns new ArrayList, else returns list of sourceF
   *         elements
   */
  public static ArrayList<MarkElement> getSourceList(IMarker iMarker) {
    ArrayList<MarkElement> sourceList = new ArrayList<MarkElement>();
    try {
      if (iMarker.getAttribute(MarkElementUtilities.getSourceAttributeName()) != null) {
        sourceList = Serialization.getInstance().fromString(
            (String) iMarker.getAttribute(MarkElementUtilities.getSourceAttributeName()));
      }
    } catch (ClassNotFoundException | IOException | CoreException e) {
      e.printStackTrace();
    }
    return sourceList;
  }

  /**
   * @param iMarker
   * @return If marker has not any target returns new ArrayList, else returns list of target
   *         elements
   */
  public static ArrayList<MarkElement> getTargetList(IMarker iMarker) {
    ArrayList<MarkElement> targetList = new ArrayList<MarkElement>();
    try {
      if (iMarker.getAttribute(MarkElementUtilities.getTargetAttributeName()) != null) {
        targetList = Serialization.getInstance().fromString(
            (String) iMarker.getAttribute(MarkElementUtilities.getTargetAttributeName()));
      }
    } catch (ClassNotFoundException | IOException | CoreException e) {
      e.printStackTrace();
    }
    return targetList;
  }

  /**
   * Sets the MarkElement.getSourceAttributeName() named attribute of marker with given parameter
   * sourceList
   * 
   * @param iMarker
   * @param sourceList
   */
  public static void setSourceList(IMarker iMarker, ArrayList<MarkElement> sourceList) {
    try {
      iMarker.setAttribute(MarkElementUtilities.getSourceAttributeName(),
          Serialization.getInstance().toString(sourceList));
    } catch (CoreException | IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Sets the MarkElement.getTargetAttributeName() named attribute of marker with given parameter
   * targetList
   * 
   * @param iMarker
   * @param sourceList
   */
  public static void setTargetList(IMarker iMarker, ArrayList<MarkElement> targetList) {
    try {
      iMarker.setAttribute(MarkElementUtilities.getTargetAttributeName(),
          Serialization.getInstance().toString(targetList));
    } catch (CoreException | IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Compares two marker with their sourceIds
   * 
   * @param iMarker1
   * @param iMarker2
   * @return true if equals, false otherwise
   */
  public static boolean compare(IMarker iMarker1, IMarker iMarker2) {
    if (MarkElementUtilities.getSourceId(iMarker1)
        .equals(MarkElementUtilities.getSourceId(iMarker2))) {
      return true;
    }
    return false;
  }
}
