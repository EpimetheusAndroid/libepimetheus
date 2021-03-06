[libepimetheus](../index.md) / [tk.hacker1024.libepimetheus](./index.md)

## Package tk.hacker1024.libepimetheus

Code to connect to Pandora's APIs.

### Types

| Name | Summary |
|---|---|
| [Browse](-browse/index.md) | `object Browse`<br>This singleton contains functions to browse Pandora. |
| [Networking](-networking/index.md) | `object Networking`<br>This singleton contains networking functions, used to call Pandora API methods. The Pandora REST API is documented [here](https://6xq.net/pandora-apidoc/rest/). |
| [Search](-search/index.md) | `object Search`<br>This singleton contains functions to search Pandora. |
| [StationRecommendations](-station-recommendations/index.md) | `data class StationRecommendations`<br>Data class holding station recommendations from Pandora. |
| [Stations](-stations/index.md) | `object Stations`<br>This singleton contains functions to retrieve station information. The Pandora station APIs are documented [here](https://6xq.net/pandora-apidoc/rest/stations/). |
| [User](-user/index.md) | `class User : `[`Parcelable`](https://developer.android.com/reference/android/os/Parcelable.html)<br>This class holds the authentication token and user information. All other functions in this library that call Pandora APIs will need an instance of this class. The Pandora authentication API is documented [here](https://6xq.net/pandora-apidoc/rest/authentication/). |

### Exceptions

| Name | Summary |
|---|---|
| [InvalidAuthTokenException](-invalid-auth-token-exception.md) | `class InvalidAuthTokenException : `[`PandoraException`](-pandora-exception/index.md)<br>Thrown when the authentication token in invalid. |
| [InvalidLoginException](-invalid-login-exception.md) | `class InvalidLoginException : `[`PandoraException`](-pandora-exception/index.md)<br>Thrown when a login is invalid. |
| [InvalidRequestException](-invalid-request-exception.md) | `class InvalidRequestException : `[`PandoraException`](-pandora-exception/index.md)<br>Thrown when an "invalid request" response is received from Pandora. |
| [LocationException](-location-exception.md) | `class LocationException : `[`PandoraException`](-pandora-exception/index.md)<br>Thrown when Pandora can't be accessed because of location restrictions. |
| [PandoraException](-pandora-exception/index.md) | `abstract class PandoraException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)<br>A generic exception to be used when the reason for the error is unknown. |

### Functions

| Name | Summary |
|---|---|
| [addFeedback](add-feedback.md) | `fun `[`Song`](../tk.hacker1024.libepimetheus.data/-song/index.md)`.addFeedback(thumbsUp: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, user: `[`User`](-user/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds feedback for the [Song](../tk.hacker1024.libepimetheus.data/-song/index.md). |
| [addTired](add-tired.md) | `fun `[`Song`](../tk.hacker1024.libepimetheus.data/-song/index.md)`.addTired(user: `[`User`](-user/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Sets the [Song](../tk.hacker1024.libepimetheus.data/-song/index.md) as tired (won't play for a while). |
| [delete](delete.md) | `fun `[`Station`](../tk.hacker1024.libepimetheus.data/-station/index.md)`.delete(user: `[`User`](-user/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This extension function deletes the receiver station. |
| [deleteFeedback](delete-feedback.md) | `fun `[`Rateable`](../tk.hacker1024.libepimetheus.data/-rateable/index.md)`.deleteFeedback(user: `[`User`](-user/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Removes feedback from a [Rateable](../tk.hacker1024.libepimetheus.data/-rateable/index.md). |
| [getDetails](get-details.md) | `fun `[`Station`](../tk.hacker1024.libepimetheus.data/-station/index.md)`.getDetails(user: `[`User`](-user/index.md)`): `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)<br>This extension function retrieves detailed information about a [Station](../tk.hacker1024.libepimetheus.data/-station/index.md). |
| [getFeedback](get-feedback.md) | `fun `[`Station`](../tk.hacker1024.libepimetheus.data/-station/index.md)`.getFeedback(user: `[`User`](-user/index.md)`, positive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, pageSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, startIndex: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0): `[`FeedbackList`](../tk.hacker1024.libepimetheus.data.feedback/-feedback-list/index.md)<br>Retrieves the station feedback. |
| [getGenres](get-genres.md) | `fun `[`GenreCategory`](../tk.hacker1024.libepimetheus.data.search/-genre-category/index.md)`.getGenres(user: `[`User`](-user/index.md)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`GenreStation`](../tk.hacker1024.libepimetheus.data.search/-genre-station/index.md)`>`<br>Retrieves all the genres belonging to a category. |
| [getPlaylist](get-playlist.md) | `fun `[`Station`](../tk.hacker1024.libepimetheus.data/-station/index.md)`.getPlaylist(user: `[`User`](-user/index.md)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Song`](../tk.hacker1024.libepimetheus.data/-song/index.md)`>`<br>This extension function returns the station playlist in the form of a list of [Song](../tk.hacker1024.libepimetheus.data/-song/index.md) objects. |
| [rename](rename.md) | `fun `[`Station`](../tk.hacker1024.libepimetheus.data/-station/index.md)`.rename(newName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, user: `[`User`](-user/index.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>This extension function renames the receiver station. |
