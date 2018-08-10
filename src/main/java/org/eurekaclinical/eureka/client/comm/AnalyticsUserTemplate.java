package org.eurekaclinical.eureka.client.comm;


import org.eurekaclinical.common.comm.UserTemplate;

public class AnalyticsUserTemplate  extends UserTemplate { 
    private boolean autoAuthorize;
    private String criteria;
     public AnalyticsUserTemplate() {
    }
 
 
     public boolean isAutoAuthorize() {
        return autoAuthorize;
    }
     public void setAutoAuthorize(boolean autoAuthorize) {
        this.autoAuthorize = autoAuthorize;
    }
     /**
     * Gets the criteria for triggering auto-authorization. May be
     * <code>null</code>, which means that auto-authorization will always be
     * triggered when requested. The criteria are expressed as an expression in
     * Freemarker syntax.
     */
    public String getCriteria() {
        return criteria;
    }
     /**
     * Sets criteria for triggering auto-authorization. May be
     * <code>null</code>, which means that auto-authorization will always be
     * triggered when requested.
     *
     * @param criteria the criteria for triggering auto-authorization, expressed
     * using Freemarker expression syntax.
     */
    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }
     @Override
    public String toString() {
        return "AnalyticsUserTemplate{" + ", autoAuthorize=" + autoAuthorize + ", criteria=" + criteria + super.toString() + '}';
    }
 }
