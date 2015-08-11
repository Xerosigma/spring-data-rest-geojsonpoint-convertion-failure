# Problem
GeoJsonPoint conversion does is failing with error:

```
{
  "cause": {
    "cause": null,
    "message": "No suitable constructor found for type [simple type, class org.springframework.data.mongodb.core.geo.GeoJsonPoint]: can not instantiate from JSON object (need to add/enable type information?)\n at [Source: org.apache.catalina.connector.CoyoteInputStream@5b18204c; line: 3, column: 9] (through reference chain: demo.Event[\"location\"])"
  },
  "message": "Could not read JSON: No suitable constructor found for type [simple type, class org.springframework.data.mongodb.core.geo.GeoJsonPoint]: can not instantiate from JSON object (need to add/enable type information?)\n at [Source: org.apache.catalina.connector.CoyoteInputStream@5b18204c; line: 3, column: 9] (through reference chain: demo.Event[\"location\"]); nested exception is com.fasterxml.jackson.databind.JsonMappingException: No suitable constructor found for type [simple type, class org.springframework.data.mongodb.core.geo.GeoJsonPoint]: can not instantiate from JSON object (need to add/enable type information?)\n at [Source: org.apache.catalina.connector.CoyoteInputStream@5b18204c; line: 3, column: 9] (through reference chain: demo.Event[\"location\"])"
}
```


# Reproduce
Build, run, and make the following POST request:


**/events** (**POST**)
```
{
    "location": {
        "x": 41.87572835,
        "y": -87.63669491,
        "type": "Point",
        "coordinates": [
            41.87572835,
            -87.63669491
        ]
    }
}
```