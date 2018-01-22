<script type="text/ng-template" id="templateId">
<div class="ngdialog-message">
    <h2>{{feed.name}}</h2>
    <input ng-model="feed.name"/>
    <input ng-model="feed.url"/>
</div>
<div class="ngdialog-buttons mt">
    <button ng-click="save()">Save</button>
</div>
</script>