package factset.sampleapi.api;

import factset.sampleapi.ApiException;
import factset.sampleapi.ApiClient;
import factset.sampleapi.ApiResponse;
import factset.sampleapi.Configuration;
import factset.sampleapi.Pair;

import javax.ws.rs.core.GenericType;

import factset.sampleapi.models.Order;



public class StoreApi {
  private ApiClient apiClient;

  public StoreApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StoreApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  /**
   * Delete purchase order by ID
   * For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors
   * @param orderId ID of the order that needs to be deleted (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteOrder(Long orderId) throws ApiException {
    deleteOrderWithHttpInfo(orderId);
  }

  /**
   * Delete purchase order by ID
   * For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors
   * @param orderId ID of the order that needs to be deleted (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteOrderWithHttpInfo(Long orderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling deleteOrder");
    }
    
    // create path and map variables
    String localVarPath = "/store/order/{orderId}"
      .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    return apiClient.invokeAPI("StoreApi.deleteOrder", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Returns pet inventories by status
   * Returns a map of status codes to quantities
   * @return java.util.Map&lt;String, Integer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public java.util.Map<String, Integer> getInventory() throws ApiException {
    return getInventoryWithHttpInfo().getData();
  }

  /**
   * Returns pet inventories by status
   * Returns a map of status codes to quantities
   * @return ApiResponse&lt;java.util.Map&lt;String, Integer&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.Map<String, Integer>> getInventoryWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/store/inventory";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<java.util.Map<String, Integer>> localVarReturnType = new GenericType<java.util.Map<String, Integer>>() {};
    return apiClient.invokeAPI("StoreApi.getInventory", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find purchase order by ID
   * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10.         Other values will generated exceptions
   * @param orderId ID of pet that needs to be fetched (required)
   * @return Order
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
   */
  public Order getOrderById(Long orderId) throws ApiException {
    return getOrderByIdWithHttpInfo(orderId).getData();
  }

  /**
   * Find purchase order by ID
   * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10.         Other values will generated exceptions
   * @param orderId ID of pet that needs to be fetched (required)
   * @return ApiResponse&lt;Order&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Order not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Order> getOrderByIdWithHttpInfo(Long orderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling getOrderById");
    }
    
    // create path and map variables
    String localVarPath = "/store/order/{orderId}"
      .replaceAll("\\{" + "orderId" + "\\}", apiClient.escapeString(orderId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Order> localVarReturnType = new GenericType<Order>() {};
    return apiClient.invokeAPI("StoreApi.getOrderById", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Place an order for a pet
   * 
   * @param body order placed for purchasing the pet (required)
   * @return Order
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid Order </td><td>  -  </td></tr>
     </table>
   */
  public Order placeOrder(Order body) throws ApiException {
    return placeOrderWithHttpInfo(body).getData();
  }

  /**
   * Place an order for a pet
   * 
   * @param body order placed for purchasing the pet (required)
   * @return ApiResponse&lt;Order&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid Order </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Order> placeOrderWithHttpInfo(Order body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling placeOrder");
    }
    
    // create path and map variables
    String localVarPath = "/store/order";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Order> localVarReturnType = new GenericType<Order>() {};
    return apiClient.invokeAPI("StoreApi.placeOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
