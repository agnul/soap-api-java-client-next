/**
 * Copyright 2012-2015 ContactLab, Italy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.contactlab.api.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendImmediateMessageSidCAl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendImmediateMessageSidCAl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subscriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendImmediateMessageSidCAl", propOrder = {
    "apiKey",
    "userKey",
    "campaignAlias",
    "sourceIdentifier",
    "subscriberIdentifier"
})
public class SendImmediateMessageSidCAl {

    protected String apiKey;
    protected String userKey;
    protected String campaignAlias;
    protected int sourceIdentifier;
    protected int subscriberIdentifier;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the userKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserKey() {
        return userKey;
    }

    /**
     * Sets the value of the userKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserKey(String value) {
        this.userKey = value;
    }

    /**
     * Gets the value of the campaignAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignAlias() {
        return campaignAlias;
    }

    /**
     * Sets the value of the campaignAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignAlias(String value) {
        this.campaignAlias = value;
    }

    /**
     * Gets the value of the sourceIdentifier property.
     * 
     */
    public int getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * Sets the value of the sourceIdentifier property.
     * 
     */
    public void setSourceIdentifier(int value) {
        this.sourceIdentifier = value;
    }

    /**
     * Gets the value of the subscriberIdentifier property.
     * 
     */
    public int getSubscriberIdentifier() {
        return subscriberIdentifier;
    }

    /**
     * Sets the value of the subscriberIdentifier property.
     * 
     */
    public void setSubscriberIdentifier(int value) {
        this.subscriberIdentifier = value;
    }

}
