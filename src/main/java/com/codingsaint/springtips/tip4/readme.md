### Tip 4 / 100
#### Reuse one application properties /yml to define another
- You can reuse application properties to define another. 
- If one of them contains the value which is part of another it can be used with SPEL as ```${property-name}```
- For example in below property ```app.details```  requires ```app.name``` so it use it.
```
app.name = Spring Tips
app.description = ${app.name} is great app for treasure of Spring tips
```

Once you run the app the controller with app-details end point works perfectly giving both values
```
@RestController
public class SpringPropertyReuseController {

    @Value("${app.name}")
    private String appName;

    @Value("${app.description}")
    private String appDesc;

    @GetMapping("app-details")
    public ResponseEntity<?> appDetails(){
        var map= new HashMap<String, Object>();
        map.put("name",appName);
        map.put("desc", appDesc);
        return  new ResponseEntity<>(map, HttpStatus.OK);
    }
}
```

### Output 
``` 
curl --location --request GET 'localhost:8080/app-details'

{
    "name": "Spring Tips",
    "desc": "Spring Tips is great app for treasure of Spring tips"
}
```