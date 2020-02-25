package com.sheba.recyclerviewkotlinexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sheba.recyclerviewkotlinexample.model.BlogPost

class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listItem: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_blog_list_item,
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is BlogViewHolder -> {
                holder.bind(listItem.get(position))
            }
        }

    }

    fun submitList(blogList: List<BlogPost>) {
        listItem = blogList
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    class BlogViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        val blog_image: ImageView = itemView.findViewById(R.id.blog_image)
        val blog_title: TextView = itemView.findViewById(R.id.blog_title)
        val blog_author: TextView = itemView.findViewById(R.id.blog_author)

        fun bind(blogPost: BlogPost) {
            blog_title.setText(blogPost.title)
            blog_author.setText(blogPost.userName)

            val requestOption = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOption)
                .load(blogPost.image)
                .into(blog_image)
        }
    }

}
