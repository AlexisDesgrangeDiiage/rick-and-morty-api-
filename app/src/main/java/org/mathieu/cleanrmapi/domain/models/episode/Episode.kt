package org.mathieu.cleanrmapi.domain.models.episode

/**
 * Represents a detailed description of a television series episode, typically derived from a data source or API.
 *
 * @property id The unique identifier for the episode.
 * @property name The name of the episode.
 * @property airDate The broadcast date of the episode.
 * @property episode The episode code, which usually includes both the season and episode number (e.g., S01E01).
 * @property characters A list of character identifiers (e.g., URLs) appearing in the episode.
 * @property url A URL pointing to more detailed information about the episode.
 * @property created The timestamp indicating when the episode information was added to the database or data source.
 */
data class Episode (
    val id: Int,
    val name: String,
    val airDate: String,
    val episode: String,
    val characters: List<String>,
    val url: String,
    val created: String
)
