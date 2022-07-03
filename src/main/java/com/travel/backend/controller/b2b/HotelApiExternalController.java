package com.travel.backend.controller.b2b;



import com.travel.backend.model.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Simin
 * @created 12/06/2022 - 8:49 PM
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/hotel")
//@Api(tags = "Clients")


public class HotelApiExternalController {

//    @Autowired
//    AuthenticationManager authenticationManager;
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    RoleRepository roleRepository;
//
//    @Autowired
//    PasswordEncoder encoder;
//
//    @Autowired
//    JwtUtils jwtUtils;

    //    @Value("${app.x-api-key}")
//    private int jwtExpirationMs;

//    @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/getEvents")
    public PropertyEvents getEvents() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/content/v1/properties/events?count=200&timestamp=2019-06-20T10%3A41%3A04Z";
        return restTemplate.exchange(uri, HttpMethod.GET, request, PropertyEvents.class).getBody();

    }

   // @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/getProperties")
    public PropertyInfoPage getProperties() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/content/v1/properties";
        return restTemplate.exchange(uri, HttpMethod.GET, request, PropertyInfoPage.class).getBody();
    }

   // @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/getMealPlans")
    public MealPlan getMealPlans() {
        RestTemplate restTemplate = new RestTemplate();
        //HttpEntity<String> request = new HttpEntity<>(String);
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/content/v1/meal-plans";
        return restTemplate.exchange(uri, HttpMethod.GET, request, MealPlan.class).getBody();
    }

   // @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/getPropertieById/{propertyId}")
    public PropertyInfoTypeWithInclude getPropertiesById(@PathVariable String propertyId) {
        RestTemplate restTemplate = new RestTemplate();
        //HttpEntity<String> request = new HttpEntity<>(String);
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/content/v1/properties/" + propertyId;
        ResponseEntity<PropertyInfoTypeWithInclude> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, request, PropertyInfoTypeWithInclude.class);
        return responseEntity.getBody();
    }

  //  @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/getCategories")
    public RoomTypeCategory getRoomTypeCategory() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/content/v1/room-type-categories";
        return restTemplate.exchange(uri, HttpMethod.GET, request, RoomTypeCategory.class).getBody();

    }

    ///search
  //  @ApiOperation(value = "This method is used to get the clients.")
    @PostMapping("/search")
    public RoomStay search() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/search/v1/properties/room-stays/search";

        return restTemplate.exchange(uri, HttpMethod.POST, request, RoomStay.class).getBody();

    }

   // @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/getRoomStay")
    public RoomStay getRoomStay(@RequestBody SimpleSearchCriteria criteria, String propertyId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/search/v1/properties/" + propertyId + "/room-stays";
        return restTemplate.exchange(uri, HttpMethod.GET, request, RoomStay.class, criteria).getBody();

    }
//reserve
  //  @ApiOperation(value = "This method is used to get the clients.")
    @PostMapping("/bookings")
    public Booking book(@RequestBody Booking booking) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/reservation/v1/bookings";
        return restTemplate.exchange(uri, HttpMethod.POST, request, Booking.class, booking).getBody();

    }


   // @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/bookings/{number}")
    public Booking search(@PathVariable String bookNumber) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/reservation/v1/bookings" + bookNumber;
        return restTemplate.exchange(uri, HttpMethod.GET, request, Booking.class).getBody();
    }


    //@ApiOperation(value = "This method is used to get the clients.")
    @PostMapping("/cancel")
    public Booking cancel(@PathVariable String reserveNumber, @RequestBody BookingCancellationRq cancellationRq) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/reservation/v1/bookings/" + reserveNumber + "/cancel";
        return restTemplate.exchange(uri, HttpMethod.POST, request, Booking.class, cancellationRq).getBody();

    }

    //@ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/calculate-cancellation-penalty")
    public Double calculateCancellationPenalty(@PathVariable String reserveNumber, @RequestBody BookingCancellationRq cancellationRq) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/reservation/v1/bookings/" + reserveNumber + "/calculate-cancellation-penalty";
        return restTemplate.exchange(uri, HttpMethod.GET, request, Double.class, cancellationRq).getBody();

    }

   // @ApiOperation(value = "This method is used to get the clients.")
    @PostMapping("/verify")
    public Booking verify(@RequestBody Booking booking) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/reservation/v1/bookings/verify";
        return restTemplate.exchange(uri, HttpMethod.POST, request, Booking.class).getBody();

    }


    /////GEO
   // @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/circle-search")
    public PropertiesPage circleSearch(@RequestBody CircleSearchCriteria circleSearchCriteria) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/geo/v1/properties/circle-search";
        return restTemplate.exchange(uri, HttpMethod.GET, request, PropertiesPage.class, circleSearchCriteria).getBody();

    }

    //@ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/rusPropertiesSearch")
    public PropertiesPage rusPropertiesSearch() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/geo/v1/countries/RUS/properties";
        return restTemplate.exchange(uri, HttpMethod.GET, request, PropertiesPage.class).getBody();
    }

  //  @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/propertiesSearchByRegionId")
    public PropertiesPage propertiesSearchByRegionId(@PathVariable String regionId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/geo/v1/regions/" + regionId + "/properties";
        return restTemplate.exchange(uri, HttpMethod.GET, request, PropertiesPage.class).getBody();
    }

    //@ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/cities/{cityId}/properties")
    public PropertiesPage citySearch(@PathVariable String cityId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/geo/v1/cities/" + cityId + "/properties";
        return restTemplate.exchange(uri, HttpMethod.GET, request, PropertiesPage.class).getBody();
    }

    //@ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/getCountries")
    public String getCountries() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/geo/v1/countries/";
        return restTemplate.exchange(uri, HttpMethod.GET, request, String.class).getBody();
    }

   // @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/countries/{countryCode}/regions")
    public PropertiesPage getRegions(@PathVariable String countryCode) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/geo/v1/countries/" + countryCode + "/regions";
        return restTemplate.exchange(uri, HttpMethod.GET, request, PropertiesPage.class).getBody();
    }

  //  @ApiOperation(value = "This method is used to get the clients.")
    @GetMapping("/countries/{countryCode}/cities")
    public CititesResponse getCities(@PathVariable String countryCode) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-api-key", "47306034-78fc-4767-bfd9-25e788zvezda");
        HttpEntity<Object> request = new HttpEntity<Object>(headers);
        String uri = "https://partner.qatl.ru/api/geo/v1/countries/" + countryCode + "/cities";
        return restTemplate.exchange(uri, HttpMethod.GET, request, CititesResponse.class).getBody();
    }
}
