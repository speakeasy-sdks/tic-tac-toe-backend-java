# tic-tac-toe-backend

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'tic_tac_toe_backend.tic_tac_toe_backends:tic-tac-toe-backend:1.5.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import tic_tac_toe_backend.tic_tac_toe_backends.TicTacToeBackends;
import tic_tac_toe_backend.tic_tac_toe_backends.models.operations.GetResponse;

public class Application {
    public static void main(String[] args) {
        try {
            TicTacToeBackends sdk = TicTacToeBackends.builder()
                .build();

            GetResponse res = sdk.get();

            if (res.body != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [TicTacToeBackends SDK](docs/sdks/tictactoebackends/README.md)

* [get](docs/sdks/tictactoebackends/README.md#get) - Root endpoint.
* [getVersion](docs/sdks/tictactoebackends/README.md#getversion) - Root endpoint.
* [putGames](docs/sdks/tictactoebackends/README.md#putgames) - Games endpoint. Creates the next game state from the previous game state.
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
