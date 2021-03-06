/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.build.webapi.model;


/** 
 */
public enum AgentStatus {

    /**
    * Indicates that the build agent cannot be contacted.
    */
    UNAVAILABLE(0),
    /**
    * Indicates that the build agent is currently available.
    */
    AVAILABLE(1),
    /**
    * Indicates that the build agent has taken itself offline.
    */
    OFFLINE(2),
    ;

    private int value;

    private AgentStatus(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNAVAILABLE")) { //$NON-NLS-1$
            return "unavailable"; //$NON-NLS-1$
        }

        if (name.equals("AVAILABLE")) { //$NON-NLS-1$
            return "available"; //$NON-NLS-1$
        }

        if (name.equals("OFFLINE")) { //$NON-NLS-1$
            return "offline"; //$NON-NLS-1$
        }

        return null;
    }
}
