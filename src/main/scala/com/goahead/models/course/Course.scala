package com.goahead.models.course


case class Course(
                   course_id: String,
                   course_name: String,
                   course_type: String,
                   course_image_url: String,
                   course_detail_url: String,
                   num_likes: Long,
                   times_played: Long,
                   clear_check_time: String,
                   creator: Creator,
                   tag1: String,
                   tag2: String,
                   world_record_holder: Player,
                   wr_time: Option[String],
                   first_player: Player,
                   clear_rate: String,
                   completed: Long,
                   total_times: Long,
                   oss_image_url: Option[String]
                 )

case class Creator(creator_name: String,
                   creator_avatar: String,
                   creator_nationality: String)

case class Player(name: Option[String], avatar: Option[String], nationality: Option[String])

case class Courses(courses: Seq[Course])
