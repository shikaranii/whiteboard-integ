/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.sample.whiteboardapp;

import java.io.StringWriter;
import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author srberamis
 */
public class Figure {
    private JsonObject json;

    public void setJson(JsonObject json) {
        this.json = json;
    }

    public JsonObject getJson() {
        return json;
    }

    public Figure() {
    }
    
      public Figure(JsonObject json) {
        this.json = json;
    }
       @Override
    public String toString() {
        StringWriter writer = new StringWriter();
        Json.createWriter(writer).write(json);
        return writer.toString();
    }
}
