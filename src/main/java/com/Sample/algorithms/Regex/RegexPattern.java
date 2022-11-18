package com.Sample.algorithms.Regex;

import org.json.JSONArray;
import org.json.JSONObject;

public class RegexPattern {
    public static void main(String[] args){
        String structElement = "{\n" +
                "  \"type\" : \"struct\",\n" +
                "  \"fields\" : [ {\n" +
                "    \"name\" : \"struct_column\",\n" +
                "    \"type\" : {\n" +
                "      \"type\" : \"struct\",\n" +
                "      \"fields\" : [ {\n" +
                "        \"name\" : \"key1\",\n" +
                "        \"type\" : \"string\",\n" +
                "        \"nullable\" : true,\n" +
                "        \"metadata\" : { }\n" +
                "      }, {\n" +
                "        \"name\" : \"key2\",\n" +
                "        \"type\" : \"string\",\n" +
                "        \"nullable\" : true,\n" +
                "        \"metadata\" : { }\n" +
                "      }, {\n" +
                "        \"name\" : \"keyn\",\n" +
                "        \"type\" : \"string\",\n" +
                "        \"nullable\" : true,\n" +
                "        \"metadata\" : { }\n" +
                "      } ]\n" +
                "    },\n" +
                "    \"nullable\" : true,\n" +
                "    \"metadata\" : { }\n" +
                "  }, {\n" +
                "    \"name\" : \"struct_column2\",\n" +
                "    \"type\" : {\n" +
                "      \"type\" : \"struct\",\n" +
                "      \"fields\" : [ {\n" +
                "        \"name\" : \"key1\",\n" +
                "        \"type\" : \"string\",\n" +
                "        \"nullable\" : true,\n" +
                "        \"metadata\" : { }\n" +
                "      }, {\n" +
                "        \"name\" : \"key2\",\n" +
                "        \"type\" : \"integer\",\n" +
                "        \"nullable\" : true,\n" +
                "        \"metadata\" : { }\n" +
                "      } ]\n" +
                "    },\n" +
                "    \"nullable\" : true,\n" +
                "    \"metadata\" : { }\n" +
                "  } ]\n" +
                "}";

        String arrayElement = "{\n" +
                "  \"type\" : \"struct\",\n" +
                "  \"fields\" : [ {\n" +
                "    \"name\" : \"states\",\n" +
                "    \"type\" : {\n" +
                "      \"type\" : \"array\",\n" +
                "      \"elementType\" : \"string\",\n" +
                "      \"containsNull\" : true\n" +
                "    },\n" +
                "    \"nullable\" : true,\n" +
                "    \"metadata\" : { }\n" +
                "  }, {\n" +
                "    \"name\" : \"sample\",\n" +
                "    \"type\" : {\n" +
                "      \"type\" : \"array\",\n" +
                "      \"elementType\" : \"string\",\n" +
                "      \"containsNull\" : true\n" +
                "    },\n" +
                "    \"nullable\" : true,\n" +
                "    \"metadata\" : { }\n" +
                "  }, {\n" +
                "    \"name\" : \"temp\",\n" +
                "    \"type\" : \"string\",\n" +
                "    \"nullable\" : true,\n" +
                "    \"metadata\" : { }\n" +
                "  } ]\n" +
                "}";

        RootParse(structElement);
    }

    public static void RootParse(String element){
        JSONObject jsonObject = new JSONObject(element);
        JSONArray jsonArray = jsonObject.getJSONArray("fields");

        for(int i = 0; i < jsonArray.length(); i++) {
            //column level
            System.out.println("-------------------------------------------------------------");
            JSONObject root = (JSONObject) jsonArray.get(i);
            System.out.println("COLUMN NAME ->  "+root.get("name"));
            System.out.println("-------------------------------------------------------------");
            if(root.get("type").equals("integer")||root.get("type").equals("string")){
                System.out.println("simple type : "+root.get("type"));
            }
            else{
                JSONObject child = (JSONObject) root.get("type");
                if(child.get("type").equals("array"))
                {
                    NestedArrayParser(child);
                }
                else{
                    NestedStructParser(child);
                }
            }

        }
    }

    public static void NestedStructParser(JSONObject child){
        JSONArray  childArray = child.getJSONArray("fields");
        for(int j = 0; j < childArray.length(); j++) {
            JSONObject fieldTypes =(JSONObject) childArray.get(j);
            System.out.println("struct Type : "+fieldTypes.get("name")+"-"+fieldTypes.get("type")+"-"+fieldTypes.get("nullable"));
        }
    }


    public static void NestedArrayParser(JSONObject child){
        System.out.println("array type : "+child.get("elementType"));
    }
}
