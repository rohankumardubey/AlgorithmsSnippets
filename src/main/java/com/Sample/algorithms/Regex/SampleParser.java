package com.Sample.algorithms.Regex;

import org.json.JSONArray;
import org.json.JSONObject;

public class SampleParser {
    public static void main(String[] args){
      //
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

        parse(arrayElement);
    }

    public static void parse(String element){
        JSONObject jsonObject = new JSONObject(element);
        JSONArray jsonArray = jsonObject.getJSONArray("fields");
//        System.out.println(jsonArray);
//        JSONObject jsonObject1 = new JSONObject();
//        jsonObject1.put("elem1",jsonArray.get(0));
//        jsonObject1.put("elem2",jsonArray.get(1));
//        JSONObject jsonObject2 = (JSONObject) jsonObject1.get("elem1");
//        JSONObject jsonObject3 = (JSONObject) jsonObject2.get("type");
//        JSONArray array = jsonObject3.getJSONArray("fields");
//        System.out.println(array);
//        JSONArray jsonArray1 = jsonObject1.getJSONArray("name");
//        System.out.println(jsonArray1);


        for(int i = 0; i < jsonArray.length(); i++) {
            //column level
            System.out.println("======================================");
            JSONObject root = (JSONObject) jsonArray.get(i);
            System.out.println("column name ->  "+root.get("name"));
            System.out.println("======================================");
            if(root.get("type").equals("integer")||root.get("type").equals("string")){

            }
            JSONObject child = (JSONObject) root.get("type");
            JSONArray  childArray = child.getJSONArray("fields");
            for(int j = 0; j < childArray.length(); j++) {
                JSONObject fieldTypes =(JSONObject) childArray.get(j);
                System.out.println("   "+fieldTypes.get("name")+"-->"+fieldTypes.get("type"));
            }
        }
    }


    public enum DataTypes{
        JSONObject,
        Integer,
        String ,

    }
}
