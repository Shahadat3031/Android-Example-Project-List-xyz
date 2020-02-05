package com.sheba.retrofitwithrecyclerview.model;

import android.widget.Gallery;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("app_thumb")
    @Expose
    private String appThumb;
    @SerializedName("is_trending")
    @Expose
    private IsTrending isTrending;
    @SerializedName("service_title")
    @Expose
    private String serviceTitle;
    @SerializedName("popular_service_description")
    @Expose
    private Object popularServiceDescription;
    @SerializedName("other_service_description")
    @Expose
    private Object otherServiceDescription;
    @SerializedName("is_auto_sp_enabled")
    @Expose
    private Integer isAutoSpEnabled;
    @SerializedName("avg_rating")
    @Expose
    private Double avgRating;
    @SerializedName("total_ratings")
    @Expose
    private Integer totalRatings;
    @SerializedName("total_services")
    @Expose
    private Integer totalServices;
    @SerializedName("total_resources")
    @Expose
    private Integer totalResources;
    @SerializedName("total_served_orders")
    @Expose
    private Integer totalServedOrders;
    @SerializedName("banner")
    @Expose
    private String banner;
    @SerializedName("usp")
    @Expose
    private List<String> usp = null;
    @SerializedName("overview")
    @Expose
    private Overview overview;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("partnership")
    @Expose
    private Partnership partnership;
    @SerializedName("faqs")
    @Expose
    private List<Faq> faqs = null;
    @SerializedName("gallery")
    @Expose
    private List<Gallery> gallery = null;
    @SerializedName("blog")
    @Expose
    private List<Blog> blog = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getAppThumb() {
        return appThumb;
    }

    public void setAppThumb(String appThumb) {
        this.appThumb = appThumb;
    }

    public IsTrending getIsTrending() {
        return isTrending;
    }

    public void setIsTrending(IsTrending isTrending) {
        this.isTrending = isTrending;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public Object getPopularServiceDescription() {
        return popularServiceDescription;
    }

    public void setPopularServiceDescription(Object popularServiceDescription) {
        this.popularServiceDescription = popularServiceDescription;
    }

    public Object getOtherServiceDescription() {
        return otherServiceDescription;
    }

    public void setOtherServiceDescription(Object otherServiceDescription) {
        this.otherServiceDescription = otherServiceDescription;
    }

    public Integer getIsAutoSpEnabled() {
        return isAutoSpEnabled;
    }

    public void setIsAutoSpEnabled(Integer isAutoSpEnabled) {
        this.isAutoSpEnabled = isAutoSpEnabled;
    }

    public Double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(Double avgRating) {
        this.avgRating = avgRating;
    }

    public Integer getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(Integer totalRatings) {
        this.totalRatings = totalRatings;
    }

    public Integer getTotalServices() {
        return totalServices;
    }

    public void setTotalServices(Integer totalServices) {
        this.totalServices = totalServices;
    }

    public Integer getTotalResources() {
        return totalResources;
    }

    public void setTotalResources(Integer totalResources) {
        this.totalResources = totalResources;
    }

    public Integer getTotalServedOrders() {
        return totalServedOrders;
    }

    public void setTotalServedOrders(Integer totalServedOrders) {
        this.totalServedOrders = totalServedOrders;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public List<String> getUsp() {
        return usp;
    }

    public void setUsp(List<String> usp) {
        this.usp = usp;
    }

    public Overview getOverview() {
        return overview;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Partnership getPartnership() {
        return partnership;
    }

    public void setPartnership(Partnership partnership) {
        this.partnership = partnership;
    }

    public List<Faq> getFaqs() {
        return faqs;
    }

    public void setFaqs(List<Faq> faqs) {
        this.faqs = faqs;
    }

    public List<Gallery> getGallery() {
        return gallery;
    }

    public void setGallery(List<Gallery> gallery) {
        this.gallery = gallery;
    }

    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }
}
