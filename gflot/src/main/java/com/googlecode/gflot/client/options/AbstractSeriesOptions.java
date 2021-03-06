/*
 * Copyright (c) 2012 Nicolas Morel
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package com.googlecode.gflot.client.options;

import com.googlecode.gflot.client.jsni.JsonObject;

/**
 * @author AlexanderDeleon
 */
@SuppressWarnings( "unchecked" )
public abstract class AbstractSeriesOptions<T extends AbstractSeriesOptions<?>>
    extends JsonObject
{

    protected static final String SHOW_KEY = "show";

    protected AbstractSeriesOptions()
    {
    }

    /**
     * Set the visibility of the series. By default, the series is shown.
     */
    public final T setShow( boolean show )
    {
        put( SHOW_KEY, show );
        return (T) this;
    }

    /**
     * @return the visibility of the series
     */
    public final Boolean getShow()
    {
        return getBoolean( SHOW_KEY );
    }

    /**
     * Clear the visibility of the series
     */
    public final T clearShow()
    {
        clear( SHOW_KEY );
        return (T) this;
    }
}
