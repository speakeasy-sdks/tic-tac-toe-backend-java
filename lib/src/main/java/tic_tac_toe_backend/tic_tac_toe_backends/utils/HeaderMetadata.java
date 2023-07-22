/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package tic_tac_toe_backend.tic_tac_toe_backends.utils;

import java.lang.reflect.Field;

public class HeaderMetadata extends Metadata {
    public String style = "simple";
    public boolean explode;
    public String name;

    // headerParam:style=simple,explode=false,name=apiID
    public static HeaderMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        HeaderMetadata result = new HeaderMetadata();
        result = (HeaderMetadata) parse("header", result, field);
        return result;
    }

    private HeaderMetadata() {
    }
}
