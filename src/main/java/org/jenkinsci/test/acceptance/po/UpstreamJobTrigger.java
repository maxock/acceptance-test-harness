package org.jenkinsci.test.acceptance.po;

import org.apache.commons.lang.StringUtils;

/**
 * @author Kohsuke Kawaguchi
 */
public class UpstreamJobTrigger extends Trigger {
    public final Control upstreamProjects = control("upstreamProjects");

    public UpstreamJobTrigger(Job parent) {
        super(parent, "/jenkins-triggers-ReverseBuildTrigger");
    }

    public void setUpstreamProjects(final String... upstreamProjects) {
        this.upstreamProjects.set(StringUtils.join(upstreamProjects, ","));
    }
}
