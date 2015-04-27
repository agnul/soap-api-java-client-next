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

package com.contactlab.api.ws.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APNsPushStandardFieldEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="APNsPushStandardFieldEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALERT"/>
 *     &lt;enumeration value="BADGE"/>
 *     &lt;enumeration value="SOUND"/>
 *     &lt;enumeration value="CONTENT_AVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APNsPushStandardFieldEnum")
@XmlEnum
public enum APNsPushStandardFieldEnum {

    ALERT,
    BADGE,
    SOUND,
    CONTENT_AVAILABLE;

    public String value() {
        return name();
    }

    public static APNsPushStandardFieldEnum fromValue(String v) {
        return valueOf(v);
    }

}
