package factset.sampleapi.api;

import factset.sampleapi.ApiException;
import factset.sampleapi.ApiClient;
import factset.sampleapi.ApiResponse;
import factset.sampleapi.Configuration;
import factset.sampleapi.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import factset.sampleapi.models.ModelApiResponse;
import factset.sampleapi.models.Pet;



public class PetApi {
  private ApiClient apiClient;

  public PetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  /**
   * Add a new pet to the store
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
   */
  public void addPet(Pet body) throws ApiException {
    addPetWithHttpInfo(body);
  }

  /**
   * Add a new pet to the store
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> addPetWithHttpInfo(Pet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addPet");
    }
    
    // create path and map variables
    String localVarPath = "/pet";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    
    return apiClient.invokeAPI("PetApi.addPet", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
     </table>
   */
  public void deletePet(Long petId, String apiKey) throws ApiException {
    deletePetWithHttpInfo(petId, apiKey);
  }

  /**
   * Deletes a pet
   * 
   * @param petId Pet id to delete (required)
   * @param apiKey  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deletePetWithHttpInfo(Long petId, String apiKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling deletePet");
    }
    
    // create path and map variables
    String localVarPath = "/pet/{petId}"
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    if (apiKey != null)
      localVarHeaderParams.put("api_key", apiClient.parameterToString(apiKey));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    
    return apiClient.invokeAPI("PetApi.deletePet", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (required)
   * @return java.util.List&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid status value </td><td>  -  </td></tr>
     </table>
   */
  public java.util.List<Pet> findPetsByStatus(java.util.List<String> status) throws ApiException {
    return findPetsByStatusWithHttpInfo(status).getData();
  }

  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * @param status Status values that need to be considered for filter (required)
   * @return ApiResponse&lt;java.util.List&lt;Pet&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid status value </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<java.util.List<Pet>> findPetsByStatusWithHttpInfo(java.util.List<String> status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling findPetsByStatus");
    }
    
    // create path and map variables
    String localVarPath = "/pet/findByStatus";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));

    
    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<java.util.List<Pet>> localVarReturnType = new GenericType<java.util.List<Pet>>() {};
    return apiClient.invokeAPI("PetApi.findPetsByStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Finds Pets by tags
   * Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (required)
   * @return java.util.List&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid tag value </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public java.util.List<Pet> findPetsByTags(java.util.List<String> tags) throws ApiException {
    return findPetsByTagsWithHttpInfo(tags).getData();
  }

  /**
   * Finds Pets by tags
   * Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.
   * @param tags Tags to filter by (required)
   * @return ApiResponse&lt;java.util.List&lt;Pet&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid tag value </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<java.util.List<Pet>> findPetsByTagsWithHttpInfo(java.util.List<String> tags) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tags' is set
    if (tags == null) {
      throw new ApiException(400, "Missing the required parameter 'tags' when calling findPetsByTags");
    }
    
    // create path and map variables
    String localVarPath = "/pet/findByTags";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

    
    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<java.util.List<Pet>> localVarReturnType = new GenericType<java.util.List<Pet>>() {};
    return apiClient.invokeAPI("PetApi.findPetsByTags", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return Pet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
     </table>
   */
  public Pet getPetById(Long petId) throws ApiException {
    return getPetByIdWithHttpInfo(petId).getData();
  }

  /**
   * Find pet by ID
   * Returns a single pet
   * @param petId ID of pet to return (required)
   * @return ApiResponse&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Pet> getPetByIdWithHttpInfo(Long petId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling getPetById");
    }
    
    // create path and map variables
    String localVarPath = "/pet/{petId}"
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

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

    String[] localVarAuthNames = new String[] { "api_key" };

    GenericType<Pet> localVarReturnType = new GenericType<Pet>() {};
    return apiClient.invokeAPI("PetApi.getPetById", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * Update an existing pet
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Validation exception </td><td>  -  </td></tr>
     </table>
   */
  public void updatePet(Pet body) throws ApiException {
    updatePetWithHttpInfo(body);
  }

  /**
   * Update an existing pet
   * 
   * @param body Pet object that needs to be added to the store (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
       <tr><td> 405 </td><td> Validation exception </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updatePetWithHttpInfo(Pet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updatePet");
    }
    
    // create path and map variables
    String localVarPath = "/pet";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    
    return apiClient.invokeAPI("PetApi.updatePet", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
   */
  public void updatePetWithForm(Long petId, String name, String status) throws ApiException {
    updatePetWithFormWithHttpInfo(petId, name, status);
  }

  /**
   * Updates a pet in the store with form data
   * 
   * @param petId ID of pet that needs to be updated (required)
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> updatePetWithFormWithHttpInfo(Long petId, String name, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling updatePetWithForm");
    }
    
    // create path and map variables
    String localVarPath = "/pet/{petId}"
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    if (name != null)
      localVarFormParams.put("name", name);
if (status != null)
      localVarFormParams.put("status", status);

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    
    return apiClient.invokeAPI("PetApi.updatePetWithForm", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return ModelApiResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ModelApiResponse uploadFile(Long petId, String additionalMetadata, File file) throws ApiException {
    return uploadFileWithHttpInfo(petId, additionalMetadata, file).getData();
  }

  /**
   * uploads an image
   * 
   * @param petId ID of pet to update (required)
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return ApiResponse&lt;ModelApiResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelApiResponse> uploadFileWithHttpInfo(Long petId, String additionalMetadata, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'petId' is set
    if (petId == null) {
      throw new ApiException(400, "Missing the required parameter 'petId' when calling uploadFile");
    }
    
    // create path and map variables
    String localVarPath = "/pet/{petId}/uploadImage"
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    if (additionalMetadata != null)
      localVarFormParams.put("additionalMetadata", additionalMetadata);
if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "petstore_auth" };

    GenericType<ModelApiResponse> localVarReturnType = new GenericType<ModelApiResponse>() {};
    return apiClient.invokeAPI("PetApi.uploadFile", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
