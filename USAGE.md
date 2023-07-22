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