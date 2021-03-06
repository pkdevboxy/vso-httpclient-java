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

package com.microsoft.alm.workitemtracking.webapi.models;


/** 
 */
public enum TemplateType {

    WORK_ITEM_TYPE(0),
    GLOBAL_WORKFLOW(1),
    ;

    private int value;

    private TemplateType(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("WORK_ITEM_TYPE")) { //$NON-NLS-1$
            return "workItemType"; //$NON-NLS-1$
        }

        if (name.equals("GLOBAL_WORKFLOW")) { //$NON-NLS-1$
            return "globalWorkflow"; //$NON-NLS-1$
        }

        return null;
    }
}
