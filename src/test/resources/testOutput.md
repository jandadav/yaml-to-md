## Message File 1

### ZWEAD700W

  Static API definition directory '%s' is not a directory or does not exist

  **Reason:**

  One of the specified static API definition directories does not exist or is not a directory.

  **Action:**

  Review the static API definition directories and their setup. The static definition directories is specified as a launch parameter to a discovery service jar. The property key is: `apiml.discovery.staticApiDefinitionsDirectories`

### ZWEAD701E

  Error loading static API definition file '%s'

  **Reason:**

  A problem occurred while reading (IO operation) of a specific static API definition file.

  **Action:**

  Ensure that the file data is not corrupted or incorrectly encoded.

### ZWEAD702W

  Unable to process static API definition data: '%s'

  **Reason:**

  A problem occurred while parsing a static API definition file.

  **Action:**

  Review the mentioned static API definition file for errors.
  Refer to the specific log message to see what is the exact cause of the problem:
 
  - ServiceId is not defined in the file '%s'. The instance will not be created. Make sure to specify the ServiceId.
  - The `instanceBaseUrls` parameter of %s is not defined. The instance will not be created. Make sure to specify the `InstanceBaseUrl` property.
  - The API Catalog UI tile ID %s is invalid. The service %s will not have an API Catalog UI tile. Specify the correct catalog title ID.
  - One of the instanceBaseUrl of %s is not defined. The instance will not be created. Make sure to specify the InstanceBaseUrl property.
  - The URL %s does not contain a hostname. The instance of %s will not be created. The specified URL is malformed. Make sure to specify valid URL.
  - The URL %s does not contain a port number. The instance of %s will not be created.
  - The specified URL is missing a port number. Make sure to specify a valid URL.
  - The URL %s is malformed. The instance of %s will not be created: The Specified URL is malformed. Make sure to specify a valid URL.
  - The hostname of URL %s is unknown. The instance of %s will not be created: Thes specified hostname of the URL is invalid. Make sure to specify valid hostname.
  - Invalid protocol. The specified protocol of the URL is invalid. Make sure to specify valid protocol.

### ZWEAD703E

  I/O problem occurred during reading static API definition directory: '%s'

  **Reason:**

  The property files of type .yml were not found.

  **Action:**

  Review the paths for validity of your .yml files.

## Message File 2

### ZWEAD700W

  Static API definition directory '%s' is not a directory or does not exist

  **Reason:**

  One of the specified static API definition directories does not exist or is not a directory.

  **Action:**

  Review the static API definition directories and their setup. The static definition directories is specified as a launch parameter to a discovery service jar. The property key is: `apiml.discovery.staticApiDefinitionsDirectories`

### ZWEAD701E

  Error loading static API definition file '%s'

  **Reason:**

  A problem occurred while reading (IO operation) of a specific static API definition file.

  **Action:**

  Ensure that the file data is not corrupted or incorrectly encoded.

### ZWEAD702W

  Unable to process static API definition data: '%s'

  **Reason:**

  A problem occurred while parsing a static API definition file.

  **Action:**

  Review the mentioned static API definition file for errors.
  Refer to the specific log message to see what is the exact cause of the problem:
 
  - ServiceId is not defined in the file '%s'. The instance will not be created. Make sure to specify the ServiceId.
  - The `instanceBaseUrls` parameter of %s is not defined. The instance will not be created. Make sure to specify the `InstanceBaseUrl` property.
  - The API Catalog UI tile ID %s is invalid. The service %s will not have an API Catalog UI tile. Specify the correct catalog title ID.
  - One of the instanceBaseUrl of %s is not defined. The instance will not be created. Make sure to specify the InstanceBaseUrl property.
  - The URL %s does not contain a hostname. The instance of %s will not be created. The specified URL is malformed. Make sure to specify valid URL.
  - The URL %s does not contain a port number. The instance of %s will not be created.
  - The specified URL is missing a port number. Make sure to specify a valid URL.
  - The URL %s is malformed. The instance of %s will not be created: The Specified URL is malformed. Make sure to specify a valid URL.
  - The hostname of URL %s is unknown. The instance of %s will not be created: Thes specified hostname of the URL is invalid. Make sure to specify valid hostname.
  - Invalid protocol. The specified protocol of the URL is invalid. Make sure to specify valid protocol.

### ZWEAD703E

  I/O problem occurred during reading static API definition directory: '%s'

  **Reason:**

  The property files of type .yml were not found.

  **Action:**

  Review the paths for validity of your .yml files.

