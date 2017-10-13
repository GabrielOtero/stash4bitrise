package br.com.dextra.stash4bitrise.pojo;

import com.google.gson.annotations.SerializedName;

public class PostBody{
    @SerializedName("hook_info")
    public HookInfo hookInfo;

    @SerializedName("build_params")
    public BuildParams buildParams;

    @SerializedName("triggered_by")
    public String triggeredBy;

    public PostBody(String branch, String apiToken) {
        this.hookInfo = new HookInfo(apiToken);
        this.buildParams = new BuildParams(branch);
        this.triggeredBy = "curl";
    }

    public HookInfo getHookInfo() {
        return hookInfo;
    }

    public BuildParams getBuildParams() {
        return buildParams;
    }

    public String getTriggeredBy() {
        return triggeredBy;
    }

    private class HookInfo {
        public String type;

        @SerializedName("api_token")
        public String apiToken;

        public HookInfo(String apiToken) {
            this.type = "bitrise";
            this.apiToken = apiToken;
        }

        public String getType() {
            return type;
        }

        public String getApiToken() {
            return apiToken;
        }
    }

    private class BuildParams {
        public String branch;

        public BuildParams(String branch) {
            this.branch = branch;
        }

        public String getBranch() {
            return branch;
        }
    }
}

