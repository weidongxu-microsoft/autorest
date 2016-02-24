/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyformdata;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodyformdata.models.ErrorException;
import java.io.InputStream;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in FormdataOperations.
 */
public final class FormdataOperationsImpl implements FormdataOperations {
    /** The Retrofit service to perform REST calls. */
    private FormdataService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATFormDataService client;

    /**
     * Initializes an instance of FormdataOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FormdataOperationsImpl(Retrofit retrofit, AutoRestSwaggerBATFormDataService client) {
        this.service = retrofit.create(FormdataService.class);
        this.client = client;
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> uploadFile(InputStream fileContent, String fileName) throws ErrorException, IOException, IllegalArgumentException {
        if (fileContent == null) {
            throw new IllegalArgumentException("Parameter fileContent is required and cannot be null.");
        }
        if (fileName == null) {
            throw new IllegalArgumentException("Parameter fileName is required and cannot be null.");
        }
        Call<ResponseBody> call = service.uploadFile(fileContent, fileName);
        return uploadFileDelegate(call.execute());
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> uploadFileAsync(InputStream fileContent, String fileName, final ServiceCallback<InputStream> serviceCallback) {
        if (fileContent == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter fileContent is required and cannot be null."));
            return null;
        }
        if (fileName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter fileName is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.uploadFile(fileContent, fileName);
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(uploadFileDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<InputStream> uploadFileDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<InputStream, ErrorException>()
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> uploadFileViaBody(InputStream fileContent, String fileName) throws ErrorException, IOException, IllegalArgumentException {
        if (fileContent == null) {
            throw new IllegalArgumentException("Parameter fileContent is required and cannot be null.");
        }
        if (fileName == null) {
            throw new IllegalArgumentException("Parameter fileName is required and cannot be null.");
        }
        Call<ResponseBody> call = service.uploadFileViaBody(fileContent, fileName);
        return uploadFileViaBodyDelegate(call.execute());
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> uploadFileViaBodyAsync(InputStream fileContent, String fileName, final ServiceCallback<InputStream> serviceCallback) {
        if (fileContent == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter fileContent is required and cannot be null."));
            return null;
        }
        if (fileName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter fileName is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.uploadFileViaBody(fileContent, fileName);
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(uploadFileViaBodyDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<InputStream> uploadFileViaBodyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<InputStream, ErrorException>()
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}