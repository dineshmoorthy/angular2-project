
package com.sforce.soap.schemas._class.ws_acq_leads;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WS_ACQ_LeadsService", targetNamespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", wsdlLocation = "file:/C:/1PCenturyLink/WSDLs/Real-WSDLs/WS_ACQ_Leads.wsdl.xml")
public class WSACQLeadsService
    extends Service
{

    private final static URL WSACQLEADSSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSACQLEADSSERVICE_EXCEPTION;
    private final static QName WSACQLEADSSERVICE_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "WS_ACQ_LeadsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/1PCenturyLink/WSDLs/Real-WSDLs/WS_ACQ_Leads.wsdl.xml");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSACQLEADSSERVICE_WSDL_LOCATION = url;
        WSACQLEADSSERVICE_EXCEPTION = e;
    }

    public WSACQLeadsService() {
        super(__getWsdlLocation(), WSACQLEADSSERVICE_QNAME);
    }

    public WSACQLeadsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSACQLEADSSERVICE_QNAME, features);
    }

    public WSACQLeadsService(URL wsdlLocation) {
        super(wsdlLocation, WSACQLEADSSERVICE_QNAME);
    }

    public WSACQLeadsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSACQLEADSSERVICE_QNAME, features);
    }

    public WSACQLeadsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSACQLeadsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSACQLeadsPortType
     */
    @WebEndpoint(name = "WS_ACQ_Leads")
    public WSACQLeadsPortType getWSACQLeads() {
        return super.getPort(new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "WS_ACQ_Leads"), WSACQLeadsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSACQLeadsPortType
     */
    @WebEndpoint(name = "WS_ACQ_Leads")
    public WSACQLeadsPortType getWSACQLeads(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "WS_ACQ_Leads"), WSACQLeadsPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSACQLEADSSERVICE_EXCEPTION!= null) {
            throw WSACQLEADSSERVICE_EXCEPTION;
        }
        return WSACQLEADSSERVICE_WSDL_LOCATION;
    }

}