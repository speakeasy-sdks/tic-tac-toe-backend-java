/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package tic_tac_toe_backend.tic_tac_toe_backends.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MoveAfterStateCurrentMark {
    X("X"),
    O("O");

    @JsonValue
    public final String value;

    private MoveAfterStateCurrentMark(String value) {
        this.value = value;
    }
}
