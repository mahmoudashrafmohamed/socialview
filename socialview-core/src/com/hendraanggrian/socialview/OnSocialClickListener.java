package com.hendraanggrian.socialview;

import android.support.annotation.NonNull;

/**
 * Span click listener for hashtags and mentions.
 * Hyperlinks are not affected by this listener.
 *
 * @author Hendra Anggrian (hendraanggrian@gmail.com)
 */
public interface OnSocialClickListener {

    /**
     * Triggered when a span of hashtag, mention, or hyperlink is clicked.
     *
     * @param v    a {@link SociableView}, use {@link SociableView#getTextView()} to obtain the original view.
     * @param text clicked span.
     */
    void onSocialClick(@NonNull SociableView v, @NonNull CharSequence text);
}