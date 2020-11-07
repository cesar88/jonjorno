package com.joncorno.commons.exception;

import java.util.Objects;

/**
 * Api sub error sınıfı.
 *
 * @author  Fatih Goken 
 */

/**
 * Api validation error sınıfı.
 */
class ApiValidationError  {
    /**
     * Object.
     */
    private String object; //entity adi
    /**
     * Field.
     */
    private String field; //entitydeki field ismi
    /**
     * Rejected value.
     */
    private Object rejectedValue; //reddedilen deger
    /**
     * Message.
     */
    private String message; //hatanin nedeni

    /**
     * Yeni bir Api validation error sınıfı örneği oluşturur.
     *
     * @param object  object
     * @param message message
     */
    ApiValidationError(String object, String message) {
        this.object = object;
        this.message = message;
    }

    /**
     * object alır.
     *
     * @return object
     */
    public String getObject() {
        return object;
    }

    /**
     * object set eder.
     *
     * @param object object
     */
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * field alır.
     *
     * @return field
     */
    public String getField() {
        return field;
    }

    /**
     * field set eder.
     *
     * @param field field
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * rejected value alır.
     *
     * @return rejected value
     */
    public Object getRejectedValue() {
        return rejectedValue;
    }

    /**
     * rejected value set eder.
     *
     * @param rejectedValue rejected value
     */
    public void setRejectedValue(Object rejectedValue) {
        this.rejectedValue = rejectedValue;
    }

    /**
     * message alır.
     *
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * message set eder.
     *
     * @param message message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Equals boolean.
     *
     * @param o o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiValidationError that = (ApiValidationError) o;
        return Objects.equals(object, that.object) &&
                Objects.equals(field, that.field) &&
                Objects.equals(rejectedValue, that.rejectedValue) &&
                Objects.equals(message, that.message);
    }

    /**
     * Hash code int.
     *
     * @return int
     */
    @Override
    public int hashCode() {

        return Objects.hash(object, field, rejectedValue, message);
    }

    /**
     * To string string.
     *
     * @return string
     */
    @Override
    public String toString() {
        return "ApiValidationError{" +
                "object='" + object + '\'' +
                ", field='" + field + '\'' +
                ", rejectedValue=" + rejectedValue +
                ", message='" + message + '\'' +
                '}';
    }
}