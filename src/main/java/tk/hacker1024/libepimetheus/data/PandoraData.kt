package tk.hacker1024.libepimetheus.data

import org.json.JSONArray

internal const val GENERIC_ART_URL = "https://www.pandora.com/web-version/1.25.1/images/album_500.png"

abstract class PandoraData(private val defaultArtUrl: String = GENERIC_ART_URL) {
    abstract val name: String
    internal abstract val artUrls: HashMap<Int, String>

    /**
     * This function will return the data object's art URL for the given size. If the given size
     * doesn't exist, it will return the URL for the nearest larger size.
     *
     * @param [preferredSize] The preferred size of the art.
     * @return The art URL for the nearest larger or equal size of the size specified.
     */
    fun getArtUrl(preferredSize: Int): String {
        if (artUrls.isNotEmpty()) {
            if (artUrls.containsKey(preferredSize)) return artUrls[preferredSize]!!
            artUrls.keys.sorted().apply {
                forEach { size ->
                    if (preferredSize <= size) return artUrls[size]!!
                }
                return artUrls[this.last()]!!
            }
        } else return defaultArtUrl
    }

    internal companion object {
        internal fun artJSONtoMap(artJSON: JSONArray): HashMap<Int, String> {
            return HashMap<Int, String>().also { artMap ->
                for (i in 0 until artJSON.length()) {
                    artJSON.getJSONObject(i).apply {
                        artMap[getInt("size")] = getString("url")
                    }
                }
            }
        }
    }
}