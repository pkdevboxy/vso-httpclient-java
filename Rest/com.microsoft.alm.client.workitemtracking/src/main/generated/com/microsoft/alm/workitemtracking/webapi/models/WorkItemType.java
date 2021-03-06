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

import java.util.List;

/** 
 */
public class WorkItemType
    extends WorkItemTrackingResource {

    private String description;
    private List<WorkItemTypeFieldInstance> fields;
    private String name;
    private String xmlForm;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public List<WorkItemTypeFieldInstance> getFields() {
        return fields;
    }

    public void setFields(final List<WorkItemTypeFieldInstance> fields) {
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getXmlForm() {
        return xmlForm;
    }

    public void setXmlForm(final String xmlForm) {
        this.xmlForm = xmlForm;
    }
}
