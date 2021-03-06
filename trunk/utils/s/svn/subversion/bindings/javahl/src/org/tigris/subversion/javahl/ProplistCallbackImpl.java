/**
 * @copyright
 * ====================================================================
 * Copyright (c) 2007 CollabNet.  All rights reserved.
 *
 * This software is licensed as described in the file COPYING, which
 * you should have received as part of this distribution.  The terms
 * are also available at http://subversion.tigris.org/license-1.html.
 * If newer versions of this license are posted there, you may use a
 * newer version instead, at your option.
 *
 * This software consists of voluntary contributions made by many
 * individuals.  For exact contribution history, see the revision
 * history and logs, available at http://subversion.tigris.org/.
 * ====================================================================
 * @endcopyright
 */

package org.tigris.subversion.javahl;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of {@link ProplistCallback} interface.
 *
 * @since 1.5
 */
public class ProplistCallbackImpl implements ProplistCallback
{
    Map propMap = new HashMap();

    public void singlePath(String path, Map props)
    {
        propMap.put(path, props);
    }

    public Map getProperties(String path)
    {
        return (Map) propMap.get(path);
    }
}
