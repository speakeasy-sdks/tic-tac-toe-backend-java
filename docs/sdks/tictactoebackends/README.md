# TicTacToeBackends SDK

## Overview

Game Engine API for Tic Tac Toe: Game Engine API for Tic Tac Toe

### Available Operations

* [get](#get) - Root endpoint.
* [getVersion](#getversion) - Root endpoint.
* [putGames](#putgames) - Games endpoint. Creates the next game state from the previous game state.

## get

<br/>Returns the package name and version.<br/><br/>

### Example Usage

```java
package hello.world;

import tic_tac_toe_backend.tic_tac_toe_backends.TicTacToeBackends;
import tic_tac_toe_backend.tic_tac_toe_backends.models.operations.GetResponse;

public class Application {
    public static void main(String[] args) {
        try {
            TicTacToeBackends sdk = TicTacToeBackends.builder()
                .build();

            GetResponse res = sdk.ticTacToeBackends.get();

            if (res.body != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[tic_tac_toe_backend.tic_tac_toe_backends.models.operations.GetResponse](../../models/operations/GetResponse.md)**


## getVersion

<br/>Returns the package name and version.<br/><br/>

### Example Usage

```java
package hello.world;

import tic_tac_toe_backend.tic_tac_toe_backends.TicTacToeBackends;
import tic_tac_toe_backend.tic_tac_toe_backends.models.operations.GetVersionResponse;

public class Application {
    public static void main(String[] args) {
        try {
            TicTacToeBackends sdk = TicTacToeBackends.builder()
                .build();

            GetVersionResponse res = sdk.ticTacToeBackends.getVersion();

            if (res.body != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[tic_tac_toe_backend.tic_tac_toe_backends.models.operations.GetVersionResponse](../../models/operations/GetVersionResponse.md)**


## putGames

<br/>Accepts a GameState and Move.<br/><br/>Returns a Move including the before and after GameStates.<br/>

### Example Usage

```java
package hello.world;

import tic_tac_toe_backend.tic_tac_toe_backends.TicTacToeBackends;
import tic_tac_toe_backend.tic_tac_toe_backends.models.operations.PutGamesResponse;
import tic_tac_toe_backend.tic_tac_toe_backends.models.shared.MoveParameter;
import tic_tac_toe_backend.tic_tac_toe_backends.models.shared.MoveParameterMove;

public class Application {
    public static void main(String[] args) {
        try {
            TicTacToeBackends sdk = TicTacToeBackends.builder()
                .build();

            tic_tac_toe_backend.tic_tac_toe_backends.models.. req = "corrupti".getBytes()            

            PutGamesResponse res = sdk.ticTacToeBackends.putGames(req);

            if (res.body != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [byte[]](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[tic_tac_toe_backend.tic_tac_toe_backends.models.operations.PutGamesResponse](../../models/operations/PutGamesResponse.md)**

